## Loan_Management_System_Calculator

#### An application designed in Java using JavaFX elements.
#### After cloning the application, we run it in any idea such as IntelliJ IDEA Ultimate. We run the application using HelloControler.java class (path to file src/main/java/com/example/loanmanagementsystemcalculator/HelloController.java).
#### After running the application, the user is shown the login panel, for which the login and hsało are located in the Users floder.

<img src="Images/screen1.png" alt="screen1" width="400" height="300">

#### Następnie użytkownik zostaje przekierowany do głównego panelu systemu i ma następujące możliwości:
* Kalkulator pożyczek
  - Działa po wczęśniejszym wprowadzeniu danych: 
    - wysokość oprocentowania, 
    - na ile lat ma być pożyczka
    - wysokość pożyczki.
* Wygeneruj paragon
  - Wygenerowanie paragonu będzie możliwe po obliczeniu wysokości rat wzietej pożyczki oraz po obliczeniu całkowitej kwoty pożyczki.
* Zapisz
  - Zapisanie paragonu będzie możliwe po jego wygenerowaniu. 
  - Paragon zostanie zapisany w formie pliku tekstowego do folderu o nazwie Paragony.

<img src="Images/screen2.png" alt="screen2" width="450" height="300"> <img src="Images/screen3.png" alt="screen3" width="450" height="300">                                                                                                                                  
* Wyczyść kalkulator
  - Po wyczyszczeniu kalkulatora użytkownik ma możliwość ponownego wyliczenia rat i całkowitego kosztu pożyczki, co pozwoli mu następnie na ponowne wygenerowanie paragonu dla nowych danych.
 
* Zamknij kalkulator
  - Użytkownikowi pokazuje się końcowy panel systemu, pozwalający mu na zamknięcie głównego okna systemu.
  
<img src="Images/screen4.png" alt="screen4" width="300" heigh="180">

W ramach projektu aplikacji, zostały utworzone testy jednostkowe w klasie HelloControllerTest.java *(ścieżka do pliku src/test/java/com/example/loanmanagementsystemcalculator/HelloControllerTest.java)*. Jeden z testów został przygotowany w taki sposób, aby nie przechodził poprawnie.

  
