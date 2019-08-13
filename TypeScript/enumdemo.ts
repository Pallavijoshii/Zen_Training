enum Color {Red=1,Green,blue=4}
let c1:Color =Color.Green;
 console.log(c1);
 let c2:Color =Color.Red;
 console.log(c2);
 let colorName: string =Color[2];
 console.log(colorName)


 enum Days{Sunday=1, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}
 let d1:Days =Days.Sunday;
 let d2:Days =Days.Monday;
 let d3:Days =Days.Tuesday;
 let d4:Days =Days.Wednesday;
 let d5:Days =Days.Thursday;
 let d6:Days =Days.Friday;
 let d7:Days =Days.Saturday;
 console.log(d1,d2,d3,d4,d5,d6,d7)

 let dayName: string =Days[2];
 console.log(dayName)




for(let i in Days){
    console.log(Days[i])
}

for(let i=0;i<8;i++)
console.log(Days[i])

