var Student = /** @class */ (function () {
    function Student(rollNo, name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    Student.prototype.display = function () {
        console.log(this.rollNo + " " + this.name);
    };
    return Student;
}());
var ob1 = new Student(12, "Pallavi");
ob1.display();
var ob2 = new Student(13, "Laiba");
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
var add1 = function (a, b) { return a + b; }; //lambda functions
console.log("Addition is", add1(10, 30));
//lambda expression without parameter and with multipla statements
var message = function () {
    console.log("Hello world");
    console.log("Lambda");
};
message();
//lambda expression with parenthesis optional if single parameters 
var raiseValue = function (x) { return x + 1; };
console.log(raiseValue(10));
