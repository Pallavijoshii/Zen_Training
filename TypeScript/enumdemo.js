var Color;
(function (Color) {
    Color[Color["Red"] = 1] = "Red";
    Color[Color["Green"] = 2] = "Green";
    Color[Color["blue"] = 4] = "blue";
})(Color || (Color = {}));
var c1 = Color.Green;
console.log(c1);
var c2 = Color.Red;
console.log(c2);
var colorName = Color[2];
console.log(colorName);
var Days;
(function (Days) {
    Days[Days["Sunday"] = 1] = "Sunday";
    Days[Days["Monday"] = 2] = "Monday";
    Days[Days["Tuesday"] = 3] = "Tuesday";
    Days[Days["Wednesday"] = 4] = "Wednesday";
    Days[Days["Thursday"] = 5] = "Thursday";
    Days[Days["Friday"] = 6] = "Friday";
    Days[Days["Saturday"] = 7] = "Saturday";
})(Days || (Days = {}));
var d1 = Days.Sunday;
var d2 = Days.Monday;
var d3 = Days.Tuesday;
var d4 = Days.Wednesday;
var d5 = Days.Thursday;
var d6 = Days.Friday;
var d7 = Days.Saturday;
console.log(d1, d2, d3, d4, d5, d6, d7);
var dayName = Days[2];
console.log(dayName);
for (var i in Days) {
    console.log(Days[i]);
}
for (var i = 0; i < 8; i++)
    console.log(Days[i]);
