package jp.making.felix.roadopener.viewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import jp.making.felix.roadopener.data.Repository.RoadRepository

class RoadRegistViewModel @ViewModelInject constructor(
    repository: RoadRepository
): ViewModel() {

}