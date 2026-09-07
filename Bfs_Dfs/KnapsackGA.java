import java.util.Arrays;
import java.util.Random;

public class KnapsackGA {

    // Problem Definition
    static final int[] VALUES = { 60, 100, 120, 80, 30, 45, 70, 90 };
    static final int[] WEIGHTS = { 10, 20, 30, 15, 5, 12, 18, 25 };
    static final int MAX_CAPACITY = 60;
    static final int NUM_ITEMS = VALUES.length;

    // GA Parameters
    static final int POPULATION_SIZE = 40;
    static final double MUTATION_RATE = 0.05;
    static final int MAX_GENERATIONS = 100;
    static final int TOURNAMENT_SIZE = 3;
    static final Random RAND = new Random();

    static class Chromosome {
        int[] genes; // 1 = include item, 0 = exclude item
        int fitness;
        int totalWeight;
        int totalValue;

        Chromosome() {
            this.genes = new int[NUM_ITEMS];
            for (int i = 0; i < NUM_ITEMS; i++) {
                this.genes[i] = RAND.nextInt(2);
            }
            evaluate();
        }

        Chromosome(int[] genes) {
            this.genes = genes;
            evaluate();
        }

        // Fitness Function: Total value if within capacity, heavy penalty if exceeded
        void evaluate() {
            totalWeight = 0;
            totalValue = 0;
            for (int i = 0; i < NUM_ITEMS; i++) {
                if (genes[i] == 1) {
                    totalWeight += WEIGHTS[i];
                    totalValue += VALUES[i];
                }
            }

            if (totalWeight <= MAX_CAPACITY) {
                this.fitness = totalValue;
            } else {
                // Penalize solutions that violate the weight constraint
                this.fitness = Math.max(0, totalValue - (totalWeight - MAX_CAPACITY) * 15);
            }
        }
    }

    public static void main(String[] args) {
        // 1. Initialize Population
        Chromosome[] population = new Chromosome[POPULATION_SIZE];
        for (int i = 0; i < POPULATION_SIZE; i++) {
            population[i] = new Chromosome();
        }

        Chromosome bestOverall = getFittest(population);

        System.out.println("--- Genetic Algorithm: 0/1 Knapsack ---");
        System.out.println("Bag Max Capacity: " + MAX_CAPACITY + " kg\n");

        // 2. Main Evolution Loop
        for (int gen = 1; gen <= MAX_GENERATIONS; gen++) {
            Chromosome[] nextGen = new Chromosome[POPULATION_SIZE];

            // Elitism: Preserve the best solution directly
            nextGen[0] = bestOverall;

            for (int i = 1; i < POPULATION_SIZE; i++) {
                // Selection
                Chromosome p1 = tournamentSelect(population);
                Chromosome p2 = tournamentSelect(population);

                // Crossover
                Chromosome child = crossover(p1, p2);

                // Mutation
                mutate(child);

                nextGen[i] = child;
            }

            population = nextGen;
            Chromosome currentBest = getFittest(population);

            if (currentBest.fitness > bestOverall.fitness) {
                bestOverall = currentBest;
            }

            if (gen % 20 == 0 || gen == MAX_GENERATIONS) {
                System.out.printf("Gen %-3d | Best Value: %d | Weight: %d/%d kg | Fitness: %d%n",
                        gen, bestOverall.totalValue, bestOverall.totalWeight, MAX_CAPACITY, bestOverall.fitness);
            }
        }

        // Output Result
        System.out.println("\n--- Optimal Solution Found ---");
        System.out.println("Included Items (Genes): " + Arrays.toString(bestOverall.genes));
        System.out.println("Total Value: " + bestOverall.totalValue);
        System.out.println("Total Weight: " + bestOverall.totalWeight + " kg");
    }

    static Chromosome tournamentSelect(Chromosome[] pop) {
        Chromosome best = pop[RAND.nextInt(pop.length)];
        for (int i = 1; i < TOURNAMENT_SIZE; i++) {
            Chromosome contender = pop[RAND.nextInt(pop.length)];
            if (contender.fitness > best.fitness) {
                best = contender;
            }
        }
        return best;
    }

    // Single-Point Crossover
    static Chromosome crossover(Chromosome p1, Chromosome p2) {
        int[] childGenes = new int[NUM_ITEMS];
        int point = RAND.nextInt(NUM_ITEMS);

        for (int i = 0; i < NUM_ITEMS; i++) {
            childGenes[i] = (i < point) ? p1.genes[i] : p2.genes[i];
        }
        return new Chromosome(childGenes);
    }

    // Bit-Flip Mutation
    static void mutate(Chromosome c) {
        boolean modified = false;
        for (int i = 0; i < NUM_ITEMS; i++) {
            if (RAND.nextDouble() < MUTATION_RATE) {
                c.genes[i] = 1 - c.genes[i]; // Flip 0 <-> 1
                modified = true;
            }
        }
        if (modified) {
            c.evaluate();
        }
    }

    static Chromosome getFittest(Chromosome[] pop) {
        Chromosome best = pop[0];
        for (int i = 1; i < pop.length; i++) {
            if (pop[i].fitness > best.fitness) {
                best = pop[i];
            }
        }
        return best;
    }
}