package com.example.vrf3.Mapstruct;

import com.example.vrf3.Database.*;
import com.example.vrf3.Dto.*;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MapStructMapperImpl implements MapStructMapper{
    @Override
    public WorldData WorlddtoToWorldData(WorldDto worldDto) {
        if(worldDto == null){
            return null;
        }
        WorldData worldData = new WorldData();
        worldData.setWorld(worldDto.getWorld());

        return  worldData;
    }

    @Override
    public CategoriesData CategorieDtoToCategoriesData(CategorieDto categorieDto) {
        if(categorieDto == null){
            return null;
        }
        CategoriesData categoriesData = new CategoriesData();
        categoriesData.setCategorie(categorieDto.getCategorie());

        return  categoriesData;
    }

    @Override
    public UserData UserDtoToUserData(UserDto userDto) {
        if(userDto == null){
            return null;
        }
        UserData userData = new UserData();
        userData.setUsername(userDto.getUsername());
        userData.setPassword(userDto.getPassword());
        userData.setDisplayname(userDto.getDisplayname());
        userData.setImagesData(ImageDtoToImageData(userDto.getImageDto()));


        return  userData;
    }

    @Override
    public RoleData RoleDtoToRoleData(RoleDto roleDto) {
        if(roleDto == null){
            return null;
        }
        RoleData roleData = new RoleData();
        roleData.setRole(roleDto.getRole());
        return  roleData;
    }

    @Override
    public ImagesData ImageDtoToImageData(ImageDto imageDto) {
        if(imageDto == null){
            return null;
        }
        ImagesData imagesData = new ImagesData();
        imagesData.setImage(imageDto.getImage());

        return  imagesData;
    }

    @Override
    public Set<ImagesData> ImagesDtoToImagesData(Set<ImageDto> imageDtos) {
        if(imageDtos == null)
        {
            return null;
        }

        Set<ImagesData> set = new HashSet<ImagesData>();
        for (ImageDto imagedto : imageDtos){
            set.add(ImageDtoToImageData(imagedto));
        }
        return set;
    }

    @Override
    public EventData EventDtoToEventData(EventDto eventDto) {
        if(eventDto == null)
        {
            return null;
        }

        EventData eventData = new EventData();
        eventData.setTitel(eventDto.getTitel());
        eventData.setDescription(eventDto.getDescription());
        eventData.setCategoriesData(CategorieDtoToCategoriesData(eventDto.getCategorieDto()));
        eventData.setWorldData(WorlddtoToWorldData(eventDto.getWorldDto()));
        eventData.setImagesData(ImagesDtoToImagesData(eventDto.getImageDtos()));

        return  eventData;
    }

    @Override
    public Event_Roles_UsersData Event_Roles_UsersDtoToEvent_Roles_UsersData(Event_Roles_UsersDto event_roles_usersDto) {
        return null;
    }

    @Override
    public WorldDto WorldDataToWorldDTo(WorldData worldData) {
        if(worldData == null){
            return null;
        }
        WorldDto worldDto = new WorldDto();
        worldDto.setId(worldData.getId());
        worldDto.setWorld(worldData.getWorld());

        return  worldDto;
    }

    @Override
    public Set<WorldDto> WorldDataToWorldDTos(Set<WorldData> worldDatas) {
        if(worldDatas == null)
        {
            return null;
        }

        Set<WorldDto> set = new HashSet<WorldDto>();
        for (WorldData worldData : worldDatas){
            set.add(WorldDataToWorldDTo(worldData));
        }
        return set;
    }

    @Override
    public CategorieDto CategoriesDataToCategorieDto(CategoriesData categoriesData) {
        if(categoriesData == null){
            return null;
        }
        CategorieDto categorieDto = new CategorieDto();
        categorieDto.setId(categoriesData.getId());
        categorieDto.setCategorie(categoriesData.getCategorie());

        return  categorieDto;
    }

    @Override
    public Set<CategorieDto> CategoriesDataToCategorieDtos(Set<CategoriesData> categoriesDatas) {
        if(categoriesDatas == null)
        {
            return null;
        }

        Set<CategorieDto> set = new HashSet<CategorieDto>();
        for (CategoriesData categoriesData : categoriesDatas){
            set.add(CategoriesDataToCategorieDto(categoriesData));
        }
        return set;
    }

    @Override
    public GetUserDto UserDataToGetUserDto(UserData userData) {
        if(userData == null){
            return null;
        }
        GetUserDto getUserDto = new GetUserDto();
        getUserDto.setId(userData.getId());
        getUserDto.setUsername(userData.getUsername());
        getUserDto.setDisplayname(userData.getDisplayname());
        getUserDto.setImageDto(ImageDataToImageDto(userData.getImagesData()));

        return  getUserDto;
    }

    @Override
    public Set<GetUserDto> UserDataToGetUserDtos(Set<UserData> userDatas) {
        if(userDatas == null)
        {
            return null;
        }

        Set<GetUserDto> set = new HashSet<GetUserDto>();
        for (UserData userData : userDatas){
            set.add(UserDataToGetUserDto(userData));
        }
        return set;
    }

    @Override
    public RoleDto RoleDataToRoleDto(RoleData roleData) {
        if(roleData == null){
            return null;
        }
        RoleDto roleDto = new RoleDto();
        roleDto.setId(roleData.getId());
        roleDto.setRole(roleData.getRole());

        return  roleDto;
    }

    @Override
    public Set<RoleDto> RoleDataToRoleDtos(Set<RoleData> roleDatas) {
        if(roleDatas == null)
        {
            return null;
        }

        Set<RoleDto> set = new HashSet<RoleDto>();
        for (RoleData roleData : roleDatas){
            set.add(RoleDataToRoleDto(roleData));
        }
        return set;
    }

    @Override
    public ImageDto ImageDataToImageDto(ImagesData imagesData) {
        if(imagesData == null){
            return null;
        }
        ImageDto imageDto = new ImageDto();
        imageDto.setId(imagesData.getId());
        imageDto.setImage(imagesData.getImage());

        return  imageDto;
    }

    @Override
    public Set<ImageDto> ImageDataToImageDtos(Set<ImagesData> imagesDatas) {
        if(imagesDatas == null)
        {
            return null;
        }

        Set<ImageDto> set = new HashSet<ImageDto>();
        for (ImagesData imagesData : imagesDatas){
            set.add(ImageDataToImageDto(imagesData));
        }
        return set;
    }

    @Override
    public EventDto EventDataToEventDto(EventData eventData) {
        if(eventData == null){
            return null;
        }
        EventDto eventDto = new EventDto();
        eventDto.setId(eventData.getId());
        eventDto.setTitel(eventData.getTitel());
        eventDto.setDescription(eventData.getDescription());
        eventDto.setCategorieDto(CategoriesDataToCategorieDto(eventData.getCategoriesData()));
        eventDto.setWorldDto(WorldDataToWorldDTo(eventData.getWorldData()));
        eventDto.setEvent_roles_usersDtos(EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(eventData.getUsersrole()));

        return  eventDto;
    }

    @Override
    public Set<EventDto> EventDataToEventDtos(Set<EventData> eventDatas) {
        if(eventDatas == null)
        {
            return null;
        }

        Set<EventDto> set = new HashSet<EventDto>();
        for (EventData eventData : eventDatas){
            set.add(EventDataToEventDto(eventData));
        }
        return set;
    }

    @Override
    public Event_Roles_UsersDto EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(Event_Roles_UsersData event_roles_usersData) {
        if(event_roles_usersData == null){
            return null;
        }
        Event_Roles_UsersDto event_roles_usersDto = new Event_Roles_UsersDto();
        event_roles_usersDto.setId(event_roles_usersData.getId());
        event_roles_usersDto.setRoleDto(RoleDataToRoleDto(event_roles_usersData.getRoledata()));
        event_roles_usersDto.setUserDto(UserDataToGetUserDto(event_roles_usersData.getUserData()));

        return  event_roles_usersDto;
    }

    @Override
    public Set<Event_Roles_UsersDto> EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(Set<Event_Roles_UsersData> event_roles_usersDatas) {
        if(event_roles_usersDatas == null)
        {
            return null;
        }

        Set<Event_Roles_UsersDto> set = new HashSet<Event_Roles_UsersDto>();
        for (Event_Roles_UsersData event_roles_usersData : event_roles_usersDatas){
            set.add(EVENT_ROLES_USERS_DataToEvent_Roles_UsersDto(event_roles_usersData));
        }
        return set;
    }
}
