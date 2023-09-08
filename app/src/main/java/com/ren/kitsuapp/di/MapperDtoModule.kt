package com.ren.kitsuapp.di

import com.ren.kitsuapp.data.remote.dtos.AttributesDto
import com.ren.kitsuapp.data.remote.dtos.DataItemDto
import com.ren.kitsuapp.data.remote.dtos.KitsuResponseDto
import com.ren.kitsuapp.data.remote.dtos.LinksDto
import com.ren.kitsuapp.data.remote.dtos.RatingFrequenciesDto
import com.ren.kitsuapp.data.remote.dtos.image.CoverImageDto
import com.ren.kitsuapp.data.remote.dtos.image.DimensionsDto
import com.ren.kitsuapp.data.remote.dtos.image.MetaDto
import com.ren.kitsuapp.data.remote.dtos.image.PosterImageDto
import com.ren.kitsuapp.data.remote.dtos.titles.TitlesDto
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
import com.ren.kitsuapp.utils.mappers.dtos.AttributesDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.CoverImageDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.DataItemDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.DimensionsDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.KitsuResponseDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.LinksDtoMapper
import com.ren.kitsuapp.utils.mappers.Mapper
import com.ren.kitsuapp.utils.mappers.dtos.MetaDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.PosterImageDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.RatingFrequenciesDtoMapper
import com.ren.kitsuapp.utils.mappers.dtos.TitlesDtoMapper
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface MapperDtoModule {

    @Binds
    fun bindAttributesDtoMapper(attributesDtoMapper: AttributesDtoMapper): Mapper<AttributesDto, Attributes>

    @Binds
    fun bindCoverImageDtoMapper(coverImageDtoMapper: CoverImageDtoMapper): Mapper<CoverImageDto, CoverImage>

    @Binds
    fun bindDataItemDtoMapper(dataItemDtoMapper: DataItemDtoMapper): Mapper<DataItemDto, DataItem>

    @Binds
    fun bindDimensionsDtoMapper(dimensionsDtoMapper: DimensionsDtoMapper): Mapper<DimensionsDto, Dimensions>

    @Binds
    fun bindTinyDtoMapper(tiny: DimensionsDtoMapper.TinyDtoMapper): Mapper<DimensionsDto.Tiny, Dimensions.Tiny>

    @Binds
    fun bindLargeDtoMapper(large: DimensionsDtoMapper.LargeDtoMapper): Mapper<DimensionsDto.Large, Dimensions.Large>

    @Binds
    fun bindSmallDtoMapper(small: DimensionsDtoMapper.SmallDtoMapper): Mapper<DimensionsDto.Small, Dimensions.Small>

    @Binds
    fun bindMediumDtoMapper(medium: DimensionsDtoMapper.MediumDtoMapper): Mapper<DimensionsDto.Medium, Dimensions.Medium>

    @Binds
    fun bindKitsuResponseDtoMapper(kitsuResponseDtoMapper: KitsuResponseDtoMapper): Mapper<KitsuResponseDto, KitsuResponse>

    @Binds
    fun bindResponseMetaDtoMapper(meta: KitsuResponseDtoMapper.MetaDtoMapper): Mapper<KitsuResponseDto.Meta, KitsuResponse.Meta>

    @Binds
    fun bindLinkssDtoMapper(linksDtoMapper: LinksDtoMapper): Mapper<LinksDto, Links>

    @Binds
    fun bindMetaDtoMapper(metaDtoMapper: MetaDtoMapper): Mapper<MetaDto, Meta>

    @Binds
    fun bindPosterImageDtoMapper(posterImageDtoMapper: PosterImageDtoMapper): Mapper<PosterImageDto, PosterImage>

    @Binds
    fun bindRatingFrequenciesDtoMapper(ratingFrequenciesDtoMapper: RatingFrequenciesDtoMapper): Mapper<RatingFrequenciesDto, RatingFrequencies>

    @Binds
    fun bindTitlesDtoMapper(titlesDtoMapper: TitlesDtoMapper): Mapper<TitlesDto, Titles>
}