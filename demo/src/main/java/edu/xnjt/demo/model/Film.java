package edu.xnjt.demo.model;

import java.io.Serializable;



public class Film implements Serializable{

     private   int mid;
	private String mname;
    private String starring;
    private String into;
    public String getInto() {
		return into;
	}

	public void setInto(String into) {
		this.into = into;
	}

	private String director;
    private String imgurl;
	

	
	@Override
	public String toString() {
		return "Film [mid=" + mid + ", mname=" + mname + ", starring=" + starring + ", intro=" + into + ", director="
				+ director + ", imgurl=" + imgurl + "]";
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getStarring() {
		return starring;
	}

	public void setStarring(String starring) {
		this.starring = starring;
	}


	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
}