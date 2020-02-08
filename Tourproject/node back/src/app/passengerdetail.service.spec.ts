import { TestBed } from '@angular/core/testing';

import { PassengerdetailService } from './passengerdetail.service';

describe('PassengerdetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PassengerdetailService = TestBed.get(PassengerdetailService);
    expect(service).toBeTruthy();
  });
});
