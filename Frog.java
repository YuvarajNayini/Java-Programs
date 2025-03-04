class Frog extends Animal{
    // @Override
    // public String toString() {
    //     return "Animal-Frog";
    // }
    // overloading is also kn own as Compiletime polymorphism
    @Override // also known as RUntime polymorphism
    public void Walk(){
        System.out.println("Walk: Cannot Walk on Land");
    }
    }
    

