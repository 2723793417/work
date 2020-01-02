package edu.xnjt.demo.model;

public class FantasyMovie {
	private int mid;
	private String mname;
	private String starring;
	private String director;
	private String into;
 	private String imgurl;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", starring=" + starring + ", director=" + director
				+ ", into=" + into + ", imgurl=" + imgurl + "]";
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
	public String getInto() {
		return into;
	}
	public void setInto(String into) {
		this.into = into;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
}
