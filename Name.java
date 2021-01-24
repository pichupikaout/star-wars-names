public class Name implements Comparable<Name>{
    private String first;
    private String middle;
    private String last;
    public Name() {
        this("", "", "");
    }
    public Name(String first, String middle, String last) {
        setName(first, middle, last);
    }
    public String toString() {
        return this.first + "" + this.middle + "" + this.last;
    }
    public String toStringLast() {
        return this.last;
    }
    public String toStringFirst() {
        return this.first;
    }
    public String getFirst() {
        return this.first;
    }
    public String getMiddle() {
        return this.middle;
    }
    public String getLast() {
        return this.last;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public void setMiddle(String middle) {
        this.middle = middle;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public void setName(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
	public void setName(Name name) {
        this.first = name.first;
        this.middle = name.middle;
        this.last = name.last;
    }
	public int compareTo(Name name) {
		return this.getLast().compareTo(name.getLast());
	}
    
    
}

