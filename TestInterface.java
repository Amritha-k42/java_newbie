    //Interface declaration: by first user  
    interface Drawable{  
    void draw();  
    }  
    //Implementation: by second user  
    class Rectangle12 implements Drawable{  
    public void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle implements Drawable{  
    public void draw(){System.out.println("drawing circle");}  
    }  
    //Using interface: by third user  
    class TestInterface{  
    public static void main(String args[]){  
    Circle d=new Circle();//In real scenario, object is provided by method e.g. getDrawable() 
    Rectangle12 r= new Rectangle12();
    d.draw();  
    r.draw();
    }}  