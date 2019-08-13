var numArr = [10, 20, 30, 40, 50];
var cities = ["Mumbai", "Delhi", "Pune"];
console.log(numArr);
console.log(cities);
console.log("Size of array:" + numArr.length);
for (var i = 0; i < numArr.length; i++) {
    console.log(numArr[i]);
}
console.log("using for each loop");
numArr.forEach(function (ele) {
    console.log(ele);
});
//Initializing array at the time of initialization
var arr1 = [100, 200, 400, 300];
console.log("Size of array1: " + arr1.length);
//using for...in loop
for (var i in arr1) {
    console.log(arr1[i]);
}
//using for...of loop
for (var _i = 0, arr1_1 = arr1; _i < arr1_1.length; _i++) {
    var e = arr1_1[_i];
    console.log(e);
}
