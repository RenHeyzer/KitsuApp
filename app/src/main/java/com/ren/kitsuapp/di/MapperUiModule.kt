package com.ren.kitsuapp.di

import com.ren.kitsuapp.domain.models.Attributes
import com.ren.kitsuapp.domain.models.DataItem
import com.ren.kitsuapp.domain.models.KitsuResponse
import com.ren.kitsuapp.domain.models.Links
import com.ren.kitsuapp.domain.models.RatingFrequencies
import com.ren.kitsuapp.domain.models.image.CoverImage
import com.ren.kitsuapp.domain.models.image.Dimensions
import com.ren.kitsuapp.domain.models.image.Meta
import com.ren.kitsuapp.domain.models.image.PosterImage
import com.ren.kitsuapp.domain.models.titles.Titles
import com.ren.kitsuapp.presentation.models.AttributesUi
import com.ren.kitsuapp.presentation.models.DataItemUi
import com.ren.kitsuapp.presentation.models.KitsuResponseUi
import com.ren.kitsuapp.presentation.models.LinksUi
import com.ren.kitsuapp.presentation.models.RatingFrequenciesUi
import com.ren.kitsuapp.presentation.models.image.CoverImageUi
import com.ren.kitsuapp.presentation.models.image.DimensionsUi
import com.ren.kitsuapp.presentation.models.image.MetaUi
import com.ren.kitsuapp.presentation.models.image.PosterImageUi
import com.ren.kitsuapp.presentation.models.titles.TitlesUi
import com.ren.kitsuapp.utils.mappers.Mapper
import com.ren.kitsuapp.utils.mappers.ui.AttributesUiMapper
import com.ren.kitsuapp.utils.mappers.ui.CoverImageUiMapper
import com.ren.kitsuapp.utils.mappers.ui.DataItemUiMapper
import com.ren.kitsuapp.utils.mappers.ui.DimensionsUiMapper
import com.ren.kitsuapp.utils.mappers.ui.KitsuResponseUiMapper
import com.ren.kitsuapp.utils.mappers.ui.LinksUiMapper
import com.ren.kitsuapp.utils.mappers.ui.MetaUiMapper
import com.ren.kitsuapp.utils.mappers.ui.PosterImageUiMapper
import com.ren.kitsuapp.utils.mappers.ui.RatingFrequenciesUiMapper
import com.ren.kitsuapp.utils.mappers.ui.TitlesUiMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface MapperUiModule {

    @Binds
    fun bindAttributesUiMapper(attributesUiMapper: AttributesUiMapper): Mapper<Attributes, AttributesUi>

    @Binds
    fun bindCoverImageUiMapper(coverImageUiMapper: CoverImageUiMapper): Mapper<CoverImage, CoverImageUi>

    @Binds
    fun bindDataItemUiMapper(dataItemUiMapper: DataItemUiMapper): Mapper<DataItem, DataItemUi>

    @Binds
    fun bindDimensionsUiMapper(dimensionsUiMapper: DimensionsUiMapper): Mapper<Dimensions, DimensionsUi>

    @Binds
    fun bindTinyUiMapper(tiny: DimensionsUiMapper.TinyUiMapper): Mapper<Dimensions.Tiny, DimensionsUi.Tiny>

    @Binds
    fun bindLargeUiMapper(large: DimensionsUiMapper.LargeUiMapper): Mapper<Dimensions.Large, DimensionsUi.Large>

    @Binds
    fun bindSmallUiMapper(small: DimensionsUiMapper.SmallUiMapper): Mapper<Dimensions.Small, DimensionsUi.Small>

    @Binds
    fun bindMediumUiMapper(medium: DimensionsUiMapper.MediumUiMapper): Mapper<Dimensions.Medium, DimensionsUi.Medium>

    @Binds
    fun bindKitsuResponseUiMapper(kitsuResponseUiMapper: KitsuResponseUiMapper): Mapper<KitsuResponse, KitsuResponseUi>

    @Binds
    fun bindResponseMetaUiMapper(meta: KitsuResponseUiMapper.MetaUiMapper): Mapper<KitsuResponse.Meta, KitsuResponseUi.Meta>

    @Binds
    fun bindLinkssUiMapper(linksUiMapper: LinksUiMapper): Mapper<Links, LinksUi>

    @Binds
    fun bindMetaUiMapper(metaUiMapper: MetaUiMapper): Mapper<Meta, MetaUi>

    @Binds
    fun bindPosterImageUiMapper(posterImageUiMapper: PosterImageUiMapper): Mapper<PosterImage, PosterImageUi>

    @Binds
    fun bindRatingFrequenciesUiMapper(ratingFrequenciesUiMapper: RatingFrequenciesUiMapper): Mapper<RatingFrequencies, RatingFrequenciesUi>

    @Binds
    fun bindTitlesUiMapper(titlesUiMapper: TitlesUiMapper): Mapper<Titles, TitlesUi>
}