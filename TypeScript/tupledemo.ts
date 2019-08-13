let x: [string, number];
//initialize it 
x= ["hello", 10];
console.log(x)
//initialize it incorrectly
//x= [10, "hello"]; //error

console.log(x[0].substr(1)); //ok
//console.log(x[1].substr(1)); //error, 'number'