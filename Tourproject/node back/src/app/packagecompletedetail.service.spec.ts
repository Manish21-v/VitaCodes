import { TestBed } from '@angular/core/testing';

import { PackagecompletedetailService } from './packagecompletedetail.service';

describe('PackagecompletedetailService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PackagecompletedetailService = TestBed.get(PackagecompletedetailService);
    expect(service).toBeTruthy();
  });
});
