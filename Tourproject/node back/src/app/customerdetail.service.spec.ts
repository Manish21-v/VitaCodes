import { TestBed } from '@angular/core/testing';

import { CustomerdetailService } from './customerdetail.service';

describe('CustomerdetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CustomerdetailService = TestBed.get(CustomerdetailService);
    expect(service).toBeTruthy();
  });
});
