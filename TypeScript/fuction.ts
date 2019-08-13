function add(x: number, y: number):number{
    return x+y;
}

let z=add(10,20);
console.log("Result is: " +z);


//inferred type
function multiply(a,b){
    return a*b;
}

let d: number = multiply(12.4,4.4)
console.log("Multiplication is:" +d)



//define anonymous function
let anoAdd = function(a: number, b: number):number{
    return a+b;
};

//call anonymous function 
let res =anoAdd(100,200)
console.log("Addition= " +res);


//define function types: Lambda function
let anoAdd1: (x: number, y: number) =>number = function(a: number, b: number):number{
    return a+b;
};

//call function types 
let res1= anoAdd1(1000,2000)
console.log("Addition= " +res1);




//difference between var and let keyword
function f(shouldInitialize: boolean) {
    if (shouldInitialize) {
        var x=10;
    } return x;
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



const Pi : number =3.14;
console.log(Pi);


//object datatype = Atype that represents  non-primitive type
 
let student={
    rollNo: 12,
    name: "Pallavi",
    percentage:89
};
console.log(student);
console.log(student.rollNo=15);