package hashcode2017;

import java.util.ArrayList;

public class EndPoint {
	
	int id;
	int latency_to_data_center;
	//ArrayList<Cache> caches = new ArrayList<Cache>();
	int[] caches ;
	int[] latencies ;
	
	ArrayList<Request> requests = new ArrayList<Request>();
	
	
	public EndPoint(int _id, int _latency_to_data_center)
	{
		id = _id;
		latency_to_data_center = _latency_to_data_center;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLatency_to_data_center() {
		return latency_to_data_center;
	}


	public void setLatency_to_data_center(int latency_to_data_center) {
		this.latency_to_data_center = latency_to_data_center;
	}


	public int[] getCaches() {
		return caches;
	}


	public void setCaches(int[] caches) {
		this.caches = caches;
	}


	public int[] getLatencies() {
		return latencies;
	}


	public void setLatencies(int[] latencies) {
		this.latencies = latencies;
	}


	public ArrayList<Request> getRequests() {
		return requests;
	}


	public void setRequests(ArrayList<Request> requests) {
		this.requests = requests;
	}
	
	

}