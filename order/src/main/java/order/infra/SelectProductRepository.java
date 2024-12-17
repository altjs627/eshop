package order.infra;

import java.util.List;
import order.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "selectProducts",
    path = "selectProducts"
)
public interface SelectProductRepository
    extends PagingAndSortingRepository<SelectProduct, Long> {}
