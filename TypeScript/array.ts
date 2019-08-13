let numArr: number[] = [10,20,30,40,50];

let cities: Array<string>=["Mumbai","Delhi","Pune"];

console.log(numArr)
console.log(cities)
console.log("Size of array:" + numArr.length)
for(let i=0;i<numArr.length;i++){
    console.log(numArr[i])
}

console.log("using for each loop");
numArr.forEach(ele=>{
    console.log(ele);
});

//Initializing array at the time of initialization

let arr1=[100,200,400,300]
console.log("Size of array1: "+arr1.length)
//using for...in loop
for(let i in arr1){
    console.log(arr1[i])
}

//using for...of loop
for(let e of arr1){
    console.log(e)
}