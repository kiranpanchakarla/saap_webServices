import { StadiumModule } from './stadium.module';

describe('StadiumModule', () => {
  let stadiumModule: StadiumModule;

  beforeEach(() => {
    stadiumModule = new StadiumModule();
  });

  it('should create an instance', () => {
    expect(stadiumModule).toBeTruthy();
  });
});
