import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { com.ash.travelbooking.model.travelbooking.Booking } from '../models/booking.model';

@Injectable({
  providedIn: 'root'
})
export class BookingService {
  private apiUrl = 'http://localhost:8080/api/bookings';

  constructor(private http: HttpClient) { }

  createBooking(booking: com.ash.travelbooking.model.travelbooking.Booking): Observable<com.ash.travelbooking.model.travelbooking.Booking> {
    return this.http.post<com.ash.travelbooking.model.travelbooking.Booking>(this.apiUrl, booking);
  }

  getBooking(id: number): Observable<com.ash.travelbooking.model.travelbooking.Booking> {
    return this.http.get<com.ash.travelbooking.model.travelbooking.Booking>(`${this.apiUrl}/${id}`);
  }

  getAllBookings(): Observable<com.ash.travelbooking.model.travelbooking.Booking[]> {
    return this.http.get<com.ash.travelbooking.model.travelbooking.Booking[]>(this.apiUrl);
  }
}