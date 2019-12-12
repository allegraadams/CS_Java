import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Retail {

public static void main(String args[]) {
double product1 = 0, product2 = 0, product3 = 0;
double product4 = 0, product5 = 0;
double linevalue1 = 2.98;
double linevalue2 = 4.50;
double linevalue3 = 9.98;
double linevalue4 = 4.49;
double linevalue5 = 6.87;

String inputString;

int productId = 1;
// ask user for product number until flag value entered
while (productId != -1) {

// determine the product chosen
inputString = JOptionPane.showInputDialog(
"Enter product No. (1-5) -1 to Quit:");
productId = Integer.parseInt(inputString);

System.out.println(productId);
if (productId >= 1 && productId <= 5) {

// determine the number sold of the item
inputString = JOptionPane.showInputDialog(
"Enter quantity or -1 to Quit:");
int quantity1 = Integer.parseInt(inputString);

// Calculate the total for the item by the
// price times the quantity sold
switch (productId) {

case 1:
product1 = quantity1 * linevalue1;
break;

case 2:
product2 = product1 + (quantity1 * linevalue2);
break;

case 3:
product3 = product2 * (quantity1 * linevalue3);
break;

case 4:
product4 = product3 + (quantity1 * linevalue4);
break;

case 5:
product5 = product4 + (quantity1 * linevalue5);
break;

}

}
else if (productId != -1) {
JOptionPane.showMessageDialog(null,
"Product number must be between 1 and 5 or -1 to Quit",
"Input Error", JOptionPane.INFORMATION_MESSAGE);
}
}


// create decimal format to format floating point numbers
// with two digits to the right of the decimal point
NumberFormat moneyFormat =
NumberFormat.getCurrencyInstance(Locale.US);

// create a summary message
String output = "Product "+" quantity "+" Line Cost "+" Order cost ";
   output += "\n 1 "+" 1 "+" "+moneyFormat.format(linevalue1) +" "+ moneyFormat.format(product1);
   output += "\n 2 "+" 2 "+" "+moneyFormat.format(linevalue2) +" "+ moneyFormat.format(product2);
   output += "\n 3 "+" 3 "+" "+moneyFormat.format(linevalue3) +" "+ moneyFormat.format(product3);
   output += "\n 4 "+" 4 "+" "+moneyFormat.format(linevalue4) +" "+ moneyFormat.format(product4);
   output += "\n 5 "+" 5 "+" "+moneyFormat.format(linevalue5) +" "+ moneyFormat.format(product5) + "\n";

JTextArea outputArea = new JTextArea(6, 20);
outputArea.setText(output);

// show results
JOptionPane.showMessageDialog(null, outputArea,
"Totals", JOptionPane.INFORMATION_MESSAGE);

System.exit(0);
}

} // end class Retail

output:-