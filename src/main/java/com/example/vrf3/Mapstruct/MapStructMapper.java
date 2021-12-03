package com.example.vrf3.Mapstruct;

import com.example.vrf3.Database.*;
import com.example.vrf3.Dto.*;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.Set;

public interface MapStructMapper {
    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

    WorldData WorlddtoToWorldData(WorldDto worldDto);

    CategoriesData CategorieDtoToCategoriesData(CategorieDto categorieDto);

    UserData UserDtoToUserData(UserDto userDto);

    RoleData RoleDtoToRoleData(RoleDto roleDto);

    ImagesData ImageDtoToImageData(ImageDto imageDto);

    Set<ImagesData> ImagesDtoToImagesData(Set<ImageDto> imageDtos);

    EventData EventDtoToEventData(EventDto eventDto);

    Event_Roles_UsersData Event_Roles_UsersDtoToEvent_Roles_UsersData(Event_Roles_UsersDto event_roles_usersDto);

    WorldDto WorldDataToWorldDTo(WorldData worldData);

    Set<WorldDto> WorldDataToWorldDTos(Set<WorldData> worldDatas);

    CategorieDto CategoriesDataToCategorieDto(CategoriesData categoriesData);

    Set<CategorieDto> CategoriesDataToCategorieDtos(Set<CategoriesData> categoriesDatas);

    GetUserDto UserDataToGetUserDto(UserData userData);

    Set<GetUserDto> UserDataToGetUserDtos(Set<UserData> userDatas);

    RoleDto RoleDataToRoleDto(RoleData roleData);

    Set<RoleDto> RoleDataToRoleDtos(Set<RoleData> roleDatas);

    ImageDto ImageDataToImageDto(ImagesData imagesData);

    Set<ImageDto> ImageDataToImageDtos(Set<ImagesData> imagesDatas);

    EventDto EventDataToEventDto(EventData eventData);

    Set<EventDto> EventDataToEventDtos(Set<EventData> eventDatas);

    Event_Roles_UsersDto EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(Event_Roles_UsersData event_roles_usersData);

    Set<Event_Roles_UsersDto> EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(Set<Event_Roles_UsersData> event_roles_usersDatas);
}
