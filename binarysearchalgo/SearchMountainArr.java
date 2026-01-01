
// * // This is MountainArray's API interface.
// * // You should not implement it, or speculate about its implementation
// // * interface MountainArray {
// // * public int get(int index) {}
// // * public int length() {}
// // * }

// class SearchMountainArr {

// public int findPeak(MountainArray mountainArr){
// int start=0;
// int end=mountainArr.length()-1;
// while(start<end){
// int mid=start+(end-start)/2;
// if(mountainArr.get(mid)<mountainArr.get(mid+1)){
// start=mid+1;
// }else{
// end=mid;
// }
// }
// return start;
// }

// public int findInMountainArray(int target, MountainArray mountainArr) {
// int peak=findPeak(mountainArr);
// int start=0;
// int end =peak;
// while(start<=end){
// int mid=start+(end-start)/2;
// if(target<mountainArr.get(mid)){
// end=mid-1;
// }else if(target>mountainArr.get(mid)){
// start=mid+1;
// }else{
// return mid;
// }
// }
// start=peak;
// end=mountainArr.length()-1;
// while(start<=end){
// int mid=start+(end-start)/2;
// if(target>mountainArr.get(mid)){
// end=mid-1;
// }else if(target<mountainArr.get(mid)){
// start=mid+1;
// }else{
// return mid;
// }

// }
// return -1;
// }
// }{

// }
