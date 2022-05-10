package shopFactoryPac;

public abstract class primeAcc extends shopAcc {



private boolean isPrime;
private boolean deliveryChanges;

public void primeAcc() {
isPrime = false;
deliveryChanges = false;
}

public void bookProduct() {
int i = 0;
System.out.println("Im a Override Method");
}

@Override
public String toString() {
String str = "Priti";
return str;
}
}