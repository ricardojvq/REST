package test.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GetLyricResult", namespace="http://api.chartlyrics.com/")
public class GetLyricResult {
	
	@XmlElement(required=true,name="Lyric")
	private String lyricA;

	public String getLyric() {
		return lyricA;
	}

	public void setLyric(String lyric) {
		this.lyricA = lyric;
	}
	
	

}
