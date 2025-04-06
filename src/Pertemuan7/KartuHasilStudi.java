package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	private String semester;
	private double ips;
	private List<MataKuliah> daftarMataKuliah;

	public KartuHasilStudi (String semester) {
		this.semester = semester;
		this.daftarMataKuliah = new ArrayList<>();
	}
	public void addMataKuliah(MataKuliah matakuliah) {
		daftarMataKuliah.add(matakuliah);
	}
	public String display() {
		StringBuilder sb = new StringBuilder();		
		for (MataKuliah mk : daftarMataKuliah) {
			sb.append(mk.display());
			sb.append("\n");
		}
		return sb.toString();
	}
	public void hitungIPS() {
		double totalBobot = 0;
		int totalSks = 0;
		
		for (MataKuliah mk : daftarMataKuliah) {
			totalBobot += mk.getNilai() * mk.getSks();
			totalSks += mk.getSks();
		}
		if(totalSks > 0 ) {
			ips = totalBobot / totalSks;
		}
		else {
			ips = 0;
		}
	}
	
	/* setter getter */
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public double getIps() {
		return ips;
	}
	public void setIps(double ips) {
		this.ips = ips;
	}
	public List<MataKuliah> getDaftarMataKuliah() {
		return daftarMataKuliah;
	}
	public void  setDaftarMataKuliah(List<MataKuliah> daftarmatakuliah) {
		this.daftarMataKuliah = daftarMataKuliah;
	}
	
}

