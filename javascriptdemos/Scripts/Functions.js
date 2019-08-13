//named function

function addNums(x,y){
   // console.log(x+y)  //this function is returning void
    
      return x+y;
}


console.log('Addition is ' + addNums(12,12))

console.log('Addition of strings ' + addNums('Learning','JS'))

console.log('Addition is ' + addNums(12,'HI'))

console.log('Addition is ' + addNums(12))

console.log('Addition is ' + addNums('Hello'))


console.log('---------------')
            
            
            
            
//anonymous function
            
var res=function(){
    console.log('Anonymous function')
    
    
    
}        
res();       


//IIFE - Immediately invoke function expression

(function(a,b){
    console.log(a-b)
})(23,4)


      
//constructor functions

var a1=[]
console.log(a1)
var arr=[2,3,45,2,421,4]   //array shorthand notation

for(var a in arr){
    
    console.log(arr[a])
}


var a2=new Array()
console.log(a2)




function Employee(eid,fname,lname){                            //constructor function
     this.empId=eid
    this.fname=fname
    this.lname=lname
}

//using functions prototype

Employee.prototype.age=22

var e1=new Employee(100,'Pallavi','Joshi')
 console.log(e1.age)  //22

            
e1.age=23
console.log(e1)  //23
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            