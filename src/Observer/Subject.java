public interface Subject {
    //adiciona o observador
    public void addObserver(Observer observer);

    //remove observador
    public void removeObserver(Observer observer);

    //notifica os observadores
    public void notifyAllObserver();

}
