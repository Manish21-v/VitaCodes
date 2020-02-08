import { TestBed } from '@angular/core/testing';

import { CategorySubcategoryService } from './category-subcategory.service';

describe('CategorySubcategoryService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CategorySubcategoryService = TestBed.get(CategorySubcategoryService);
    expect(service).toBeTruthy();
  });
});
