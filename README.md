## Loan_Management_System_Calculator

#### An application designed in Java using JavaFX elements.
#### After cloning the application, we run it in any idea such as IntelliJ IDEA Ultimate. We run the application using HelloControler.java class (path to file src/main/java/com/example/loanmanagementsystemcalculator/HelloController.java).
#### After running the application, the user is shown the login panel, for which the login and hsało are located in the Users floder.

<img src="Images/screen1.png" alt="screen1" width="400" height="300">

#### The user is then redirected to the main panel of the system and has the following options:
* Loan calculator
  - works after pre-entering data:
    - amount of interest rate,
    - how many years the loan is to be for
    - the amount of the loan.
* Generate a receipt
  - It will be possible to generate a receipt after calculating the amount of installments of the loan taken and after calculating the total amount of the loan.
* Save
  - It will be possible to save the receipt after it has been generated.
  - The receipt will be saved as a text file to a folder named Paragony.

<img src="Images/screen2.png" alt="screen2" width="450" height="300"> <img src="Images/screen3.png" alt="screen3" width="450" height="300">                                                                                                                                  
* Wyczyść kalkulator
  - Po wyczyszczeniu kalkulatora użytkownik ma możliwość ponownego wyliczenia rat i całkowitego kosztu pożyczki, co pozwoli mu następnie na ponowne wygenerowanie paragonu dla nowych danych.
 
* Zamknij kalkulator
  - Użytkownikowi pokazuje się końcowy panel systemu, pozwalający mu na zamknięcie głównego okna systemu.
  
<img src="Images/screen4.png" alt="screen4" width="300" heigh="180">

W ramach projektu aplikacji, zostały utworzone testy jednostkowe w klasie HelloControllerTest.java *(ścieżka do pliku src/test/java/com/example/loanmanagementsystemcalculator/HelloControllerTest.java)*. Jeden z testów został przygotowany w taki sposób, aby nie przechodził poprawnie.

  
