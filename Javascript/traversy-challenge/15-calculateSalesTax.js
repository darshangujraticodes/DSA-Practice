const products = [
  { name: "Apple", price: 0.5, quantity: 10 },
  { name: "Banana", price: 0.3, quantity: 20 },
  { name: "Orange", price: 0.6, quantity: 15 },
];

function calculateTotalSalesWithTax(productsArray, taxAmount) {
  let temp;
  let sum = 0;
  for (k of productsArray) {
    temp = k.price * k.quantity;
    sum += temp;
  }

  let finalVal = sum + (sum * taxAmount) / 100;

  console.log(finalVal);
}

calculateTotalSalesWithTax(products, 8);
