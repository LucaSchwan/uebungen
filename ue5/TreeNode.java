/**
 * Ein Knoten in einem binaeren Baum.
 *
 * Der gespeicherte Wert ist unveraenderlich,
 * die Referenzen auf die Nachfolger koennen aber
 * geaendert werden.
 *
 * Die Klasse bietet Methoden, um Werte aus einem Baum
 * zu suchen, einzufuegen und zu loeschen. Diese gibt
 * es jeweils noch in optimierten Varianten, um
 * rotate-to-root Baeume zu verwalten.
 */
public class TreeNode {
  /**
   * Linker Nachfolger
   */
  private TreeNode left;
  /**
   * Rechter Nachfolger
   */
  private TreeNode right;
  /**
   * Wert, der in diesem Knoten gespeichert ist
   */
  private final int value;

  /**
   * Erzeugt einen neuen Knoten ohne Nachfolger
   * @param val Wert des neuen Knotens
   */
  public TreeNode(int val) {
    this.value = val;
    this.left = null;
    this.right = null;
  }

  /**
   * Erzeugt einen neuen Knoten mit den gegebenen Nachfolgern
   * @param val Wert des neuen Knotens
   * @param left linker Nachfolger des Knotens
   * @param right rechter Nachfolger des Knotens
   */
  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.value = val;
    this.left = left;
    this.right = right;
  }
  
  /**
  * @return Wert des aktuellen Knotens
  *
  */	
  public int getValue() {
    return this.value;
  }

  /**
   * @return Der gespeicherte Wert, umgewandelt in einen String
   */
  public String getValueString() {
    return Integer.toString(this.value);
  }

  /**
   * @return true, falls der Knoten einen linken Nachfolger hat, sonst false 
   */	
  public boolean hasLeft() {
    return this.left != null;
  }
  /**
   * @return true, falls der Knoten einen rechten Nachfolger hat, sonst false 
   */	
  public boolean hasRight() {
    return this.right != null;
  }


  /**
   * @return linker Nachfolger des aktuellen Knotens
   */		
  public TreeNode getLeft() {
    return this.left;
  }
  /**
   * @return rechter Nachfolger des aktuellen Knotens
   */	
  public TreeNode getRight() {
    return this.right;
  }

  /**
   * Sucht in diesem Teilbaum nach x, ohne den Baum zu veraendern.
   * @param x der gesuchte Wert
   * @return true, falls x enthalten ist, sonst false
   */
  public boolean simpleSearch(int x) {
    if(this.getValue() == x){
      return true;
    }
    else{
      if(this.left == null&&this.right == null){
        return false;
      }
      else{
        if(this.left != null){
          if(this.left.getValue() >= x){
            this.left.simpleSearch(x);
          }
        }
        if(this.right != null){
          if(this.right.getValue() <= x){
            this.right.simpleSearch(x);
          }
        }
      }
    }
    return false;
  }

  /**
   * Fuegt x in diesen Teilbaum ein.
   * @param x der einzufuegende Wert
   */
  public void insert(int x) {
   if(this.getValue() == x){
   }
   else{
    if(x < this.value){
      if(this.left == null){
        this.left = new TreeNode(x);
      }
      else{
        this.left.insert(x);
      }
   }
   else{
    if(this.right == null){
      this.right = new TreeNode(x);
    }
    else{
      this.right.insert(x);
    }
   }
  }
  }

  /**
   * Sucht in diesem Teilbaum nach x und rotiert den Endpunkt der Suche in die
   * Wurzel.
   * @param x der gesuchte Wert
   * @return die neue Wurzel des Teilbaums
   */
  public TreeNode rotationSearch(int x) {
    if(this.hasLeft()){
      if(this.getLeft().value == x){
        TreeNode ergebniss = this.getLeft();
        TreeNode t2 = this.getLeft();
        this.left = this.getLeft().getRight();
        t2.right = this;
        return ergebniss;
      }
      else{
        return this.getLeft().rotationSearch(x);
      }
    }
    if(this.hasRight()){
      if(this.getRight().value == x){
          TreeNode ergebniss = this.getRight();
          TreeNode t3 = this.getRight();
          this.right = this.getRight().getLeft();
          t3.left = this;     
          return ergebniss;
      }
      else{
        return this.getRight().rotationSearch(x);
      }
    }
    

   return this;
  }

  /**
   * @return Geordnete Liste aller Zahlen, die in diesem Teilbaum gespeichert sind.
   */
   public String toString() {
    StringBuilder strg = new StringBuilder();
    return this.toString(strg);
   }
 
   public String toString(StringBuilder strg) {
    if(this.hasRight()||this.hasLeft()){
      if(this.hasLeft()){
        left.toString(strg);
      }
      strg.append(this.getValueString() + ", ");
      if(this.hasRight()){
        right.toString(strg);
      }
    }
    else{
      strg.append(this.getValueString()+ ", ");
    }

    return strg.toString();
  }

  /**
   * Erzeugt eine dot Repraesentation in str
   * @param str Stringbuilder Objekt zur Konstruktion der Ausgabe
   * @param nullNodes Hilfsvariable, um Nullknoten zu indizieren. Anfangswert sollte 0 sein. 
   * @return Den nullNodes Wert fuer den behandelten Baum
   */
  public int toDot(StringBuilder str, int nullNodes) {
    if(this.hasLeft()) {
      str.append(this.getValueString() + " -> " + this.left.getValueString() + ";"
        + System.lineSeparator());
      nullNodes = this.left.toDot(str, nullNodes);
    } else {
      str.append("null" + nullNodes + "[shape=point]" + System.lineSeparator()
        + this.getValueString() + " -> null" + nullNodes + ";" + System.lineSeparator());
      nullNodes += 1;
    }
    if(this.hasRight()) {
      str.append(this.getValueString() + " -> " + this.right.getValueString() + ";"
        + System.lineSeparator());
      nullNodes = this.right.toDot(str, nullNodes);
    } else {
      str.append("null" + nullNodes + "[shape=point]" + System.lineSeparator()
        + this.getValueString() + " -> null" + nullNodes + ";" + System.lineSeparator());
      nullNodes += 1;
    }
    return nullNodes;
  }

}
