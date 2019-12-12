import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Products
{   
public static void main (String args[])
{
//calculate product sold, quantity and overall sales
float product1 = 0, product2 = 0, product3 = 0;
float product4 = 0, product5 = 0;
String inputString;
int productId = 1;
int totalCost = 0;
//request input for product and quantity, until flag value is entered

while (productId != -1) {
      inputString = JOptionPane.showInputDialog
      ("Enter product no.1-5 (-1 to Quit):  ");
       productId = Integer.parseInt( inputString );
       if ( productId >= 1 && productId <= 5 ) {
                           
      inputString = JOptionPane.showInputDialog
      ("Enter quantity (-1 to Quit:  ");
int quantity = Integer.parseInt( inputString );
//calculate total for all product sold
       for(int i = 0; i < 5; i++)
                 switch(productId){
                              case 1: product1 += quantity * 2.98;
                                      break;
                              case 2: product2 += quantity * 4.50;
                                      break;
                              case 3: product3 += quantity * 9.98;
                                      break;              
                              case 4: product4 += quantity * 4.49;
                                      break;               
                              case 5: product5 += quantity * 6.87;
                                      break;              
                              default: 
                                      break;
                    }
                    }
else if ( productId != 0 ) {
JOptionPane.showMessageDialog( null,
"Product number must be between 1 and 5 or -1 to Quit",
"Input Error", JOptionPane.INFORMATION_MESSAGE );
}
}

// create decimal format to format floating point numbers
// with two digits to the right of the decimal point
NumberFormat moneyFormat =
NumberFormat.getCurrencyInstance( Locale.US );
// create a summary message
String output = "Product 1: " + moneyFormat.format( product1 );
output += "\nProduct 2: "+ moneyFormat.format( product2 );
output += "\nProduct 3: " + moneyFormat.format( product3 );
output += "\nProduct 4: " + moneyFormat.format( product4 );
output += "\nProduct 5: " + moneyFormat.format( product5 ) + "\n";
JTextArea outputArea = new JTextArea( 6, 20 );
outputArea.setText( output );
// show results
JOptionPane.showMessageDialog( null, outputArea,
"Totals", JOptionPane.INFORMATION_MESSAGE );
System.exit( 0 );
}
} 