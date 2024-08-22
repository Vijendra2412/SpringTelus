package org.vjcoder;

public class Alien {
    /*
    int age;

    public Alien(){
        System.out.println("object Created");
    }
    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
    }

     */

    /*
    //6setter injection
    private int age;
    public Alien(){
        System.out.println("object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
    }

     */

    /*
    //6.1setter injection
    private int age = 22; //default value
    public Alien(){
        System.out.println("object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
    }

     */
/*
    //6.2setter injection
    private int age ;
    public Alien(){
        System.out.println("object Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
    }

 */

/*
    //6.3setter injection
    private int age ;
    private Laptop lap ;
    public Alien(){
        System.out.println("object Created");
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        lap.compile();
    }


 */

    /*
    //7 ref Attribute
    private int age ;
    private Laptop lap ;
    public Alien(){
        System.out.println("object Created");
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        lap.compile();
    }

     */
/*
    //8 Constructor injection
    private int age ;
    private Laptop lap ;
    public Alien(){
        System.out.println("object Created");
    }

    public Alien(int age) {
        System.out.println("Para.. constructor Called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        lap.compile();
    }

 */


    /*
    //8.1 Constructor injection
    private int age ;
    private Laptop lap ;
    public Alien(){
        System.out.println("object Created");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        lap.compile();
    }

     */

/*
    //8.4 Constructor injection
    private int age ;
    private int salary;
    private Laptop lap ;
    public Alien(){
        System.out.println("object Created");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        lap.compile();
    }

 */

//    9. Creating Interface
    private int age ;

    private Computer com ;
    public Alien(){
        System.out.println("object Created");
    }

//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        System.out.println("setter method");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public  void code(){
        int x;
        System.out.println(" coding... ");
        System.out.println("Its vj class");
        com.compile();
    }


}
