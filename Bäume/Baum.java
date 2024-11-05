package Bäume;

public class Baum
{
    Node root;

//Konstruktor
public Baum()
{
  root = null;
}


public void insert(int value)  //Methode
{
   if(root == null)
   {
    root = new Node(value);  //erzeugt ein neuen Knoten
   }
   else
   {
    insert(root,value);      //zeigt den Knoten u. Wert
   }
}
  private void insert(Node parent, int value)  //Überladen-> gleiche Methode mit versch. Parameter
 {
  if (parent.wert >= value) 
  {
    if (parent.links == null) //ruft es solange auf bis nichts mehr am Knoten hängt
    {
        parent.links = new Node(value);  //erzeugt ein neuen Knoten
    }
    else
    {
      insert(parent.links, value);
    }
  }
  else

  {
    if (parent.rechts == null) 
    {
        parent.rechts = new Node(value); //erzeugt ein neuen Knoten
    }
    else
    {
      insert(parent.rechts, value);
    }
   }
  }
}





