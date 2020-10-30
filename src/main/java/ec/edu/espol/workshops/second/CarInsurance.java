package ec.edu.espol.workshops.second;

public class CarInsurance {

public int  base = 500;

private CarInsurance(){
}

public int calcularPremium(Customer c) {
int total = base;
if (c.validar() == false) {
return -1;
} else if (c.edad < 65 && c.edad > 45) {
total -= 100;
} else if (c.sexo == "M" && c.casado == false && c.edad < 25) {
total += 1500; 
} else if (c.sexo == "F" && c.casado == true) {
total -= 200;
}
return total;
}

}
