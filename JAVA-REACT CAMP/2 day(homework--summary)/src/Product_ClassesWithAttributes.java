
public class Product_ClassesWithAttributes {

	public Product_ClassesWithAttributes(int _id, String _name, String _description, double _price, int _stockAmount) {
		System.out.println("yapýcý blok çalýþtý");
     this._id = _id;
     this._name = _name;
     this._description = _description;
     this._price = _price;
     this._stockAmount = _stockAmount;
	}

	public Product_ClassesWithAttributes() {

	}
	// attribute | field

	private int _id; // private: tanýmlandýðý blokta(iki süslü parantez arasý)geçerli demek
	String _name;
	private String _description;
	double _price;
	int _stockAmount;

	// getter
	public int getid() {// id sadece okur ama id ye deðer yazamaz
		return _id;
	}

	// setter
	public void setid(int id) {
		_id = id;// this.id bu class demek
	}

	String get_description() {
		return this._description.substring(0, 1);
	}

	void set_description(String _description) {
		this._description = _description;
	}
}
