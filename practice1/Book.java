package practice1;

class Book {
    private String name;
    private int page;

    public Book(String name, int page){
        this.name = name;
        this.page = page;
    }

    public Book(String name){
        this.name = name;
        page = 1;
    }
    public Book(int page){
        this.name = "Standart name";
        this.page = page;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

    public String toString(){
        return this.name+", count of pages: "+this.page;
    }

    public String readingTime(){
        return "Reading time of " + this.name + " = " + this.page * 5 + " minutes";
    }

}