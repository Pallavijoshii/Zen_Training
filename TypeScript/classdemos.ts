class Student
{
    rollNo: number;
    name: string;
    constructor(rollNo:number, name:string){
        this.rollNo=rollNo;
        this.name=name;
    }
    display():void{
        console.log(this.rollNo + " " + this.name);
    }
}

let ob1: Student = new Student(12,"Pallavi");
ob1.display();
let ob2: Student = new Student(13,"Laiba");
ob2.display();






/**
 * Lambda functions work using Lambda expression
 * 
 * Syntax:
 * for single statement
 * Let var = (parameter List) => statement;
 * 
 * for multiple statements
 * let var =(parameter List) =>statement2;
 */

let add1=(a,b) => a+b;  //lambda functions
console.log("Addition is",add1(10,30));

           //lambda expression without parameter and with multipla statements

let message = () => {
    console.log("Hello world")
    console.log("Lambda")
}
message();
           //lambda expression with parenthesis optional if single parameters 
let raiseValue = x=> x+1;
console.log(raiseValue(10))
