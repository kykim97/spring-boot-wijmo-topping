package springbootwijmotopping.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import springbootwijmotopping.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "departments",
    path = "departments"
)
public interface DepartmentRepository
    extends PagingAndSortingRepository<Department, Long> {}
