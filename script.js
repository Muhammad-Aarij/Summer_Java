// // x; 
// var x = 6;
// var x = 16;
// console.log(x); // 5

// function test() {
//   console.log("x" + x);
//   let y = 10;
//   console.log(y); // 20
//   if (true) {
//     console.log(y); // 20
//     let y = 20;
//     console.log(y); // 20
//   }
//   console.log(y); // 20
// }
// test();
console.log("filtered");
var a1 = [{a: 1, b: 3}, {a: 2}, {a: 3}, {a: 4}];

var filtered = a1.filter((x) => x.a == 1);
console.log(filtered); // Output: [{a: 1, b: 3}]

if (filtered.length > 0) {
  console.log(filtered[0].a); // Output: 1
}
