export class BookingComponent {
  bookingDetails: any = {
    flightDetails: '',
    taxiDetails: '',
    customerInfo: ''
  };

  constructor(private bookingService: BookingService) {}

  submitBooking() {
    this.bookingService.createBooking(this.bookingDetails).subscribe(response => {
      console.log('com.ash.travelbooking.model.travelbooking.Booking successful', response);
    }, error => {
      console.error('Error creating booking', error);
    });
  }
}