package org.AdctinPom;

public class PageManager {
	private LoginPom login;
	private SearchHotelPom searchhotel;
	private SelectHotelPom selectHotel;
	private RoomBookingPom roomBooking;
	
	public LoginPom getLoginPom() {
		if(login==null) {
			login =new LoginPom();
		}
		return login;
	}
	public SearchHotelPom getSearchHotelPom() {
		if(searchhotel==null) {
			searchhotel =new SearchHotelPom();
		}
		return searchhotel;
	}
	public SelectHotelPom getSelectHotelPom() {
		if(selectHotel==null) {
			selectHotel =new SelectHotelPom();
		}
		return selectHotel;
	}
	public RoomBookingPom getRoomBookingPom() {
		if(roomBooking==null) {
			roomBooking =new RoomBookingPom();
		}
		return roomBooking;
	}
	
	

}
