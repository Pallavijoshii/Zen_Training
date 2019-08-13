function add(x, y) {
    return x + y;
}
var z = add(10, 20);
console.log("Result is: " + z);
//inferred type
function multiply(a, b) {
    return a * b;
}
var d = multiply(12.4, 4.4);
console.log("Multiplication is:" + d);
//define anonymous function
var anoAdd = function (a, b) {
    return a + b;
};
//call anonymous function 
var res = anoAdd(100, 200);
console.log("Addition= " + res);
//define function types: Lambda function
var anoAdd1 = function (a, b) {
    return a + b;
};
//call function types 
var res1 = anoAdd1(1000, 2000);
console.log("Addition= " + res1);
//difference between var and let keyword
function f(shouldInitialize) {
    if (shouldInitialize) {
        var x = 10;
    }
    return x;
}
console.log(f(true)); //returns '10'
console.log(f(false)); //returns undefined
/////using let gives error
/*function fu(shouldInitialize: boolean) {
    if (shouldInitialize) {
        let x=10;
    } return x;
}
fu(true); //returns '10'
fu(false); //returns undefined*/
var Pi = 3.14;
console.log(Pi);
//object datatype
var student = {
    rollNo: 12,
    name: "Pallavi",
    percentage: 89
};
console.log(student);
console.log(student.rollNo = 15);
