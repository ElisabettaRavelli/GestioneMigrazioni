package it.polito.tdp.borders.model;

public class Evento implements Comparable<Evento>{
	private int t;
	private int n; //numero  di persone arrivate che si sposteranno
	private Country stato; //il paese in cui le persone arrivano e da cui partiranno
	
	public Evento(int t, int n, Country stato) {
		super();
		this.t = t;
		this.n = n;
		this.stato = stato;
	}
	public int getT() {
		return t;
	}
	public int getN() {
		return n;
	}
	public Country getStato() {
		return stato;
	}
	@Override
	public int compareTo(Evento o) {
		return this.t-o.t;
	}
	
	

}
