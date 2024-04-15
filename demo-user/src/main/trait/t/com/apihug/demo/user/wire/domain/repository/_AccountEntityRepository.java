package t.com.apihug.demo.user.wire.domain.repository;

import com.apihug.demo.user.wire.domain.repository.AccountEntityRepository;

/**
 * NEVER try to use this class directly, keep it as an interface(default, no public), all body of this interface will be merger to {@link AccountEntityRepository} after {@code stub }; 
 *
 *
 * NEVER try to Overwrite parent  {@link AccountEntityRepository }   or {@link org.springframework.data.repository.ListCrudRepository} 's default method!!
 *
 * @see AccountEntityRepository
 *
 * @see com.apihug.demo.user.wire.domain.AccountEntity
 */
interface _AccountEntityRepository extends AccountEntityRepository {
  /**
   * Please put your customized SQL here,  any SQL other place will be dropped after merger!
   */
  interface _DerivedSQL {
  }
}
