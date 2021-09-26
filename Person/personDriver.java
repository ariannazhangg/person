class personDriver {
    public static void main(String[] args) {
        //Making people variables (non-primitives)
        person p1;
        person p2;
        
        p1 = new person(); //using the constructor
        p2 = new person("Arianna", 16, false);
        
        p1.birthday();
        p2.funeral();
    }
}