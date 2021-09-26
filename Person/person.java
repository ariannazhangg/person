class person {
    private String name;
    private int age;
    private boolean alive;
    
    public person(){
        name = "Elaine";
        age = 100;
        alive = true;
    
    }
    
    public person(String title, int livedfor, boolean hasntgonetohellyet){
        name = title;
        age = livedfor;
        alive = hasntgonetohellyet;
    
    }
    
    public void birthday() {
        age = age + 1;
        System.out.println("Happy " + age + "th birthday, " + name + "!");
        
    }
    
    public void funeral() {
        System.out.println("Oops! You died at " + age + "! Have a happy funeral, " + name + "!");
        
    }
}