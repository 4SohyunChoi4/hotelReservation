
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReserveReserveManager from "./components/listers/ReserveReserveCards"
import ReserveReserveDetail from "./components/listers/ReserveReserveDetail"

import CleanCleanManager from "./components/listers/CleanCleanCards"
import CleanCleanDetail from "./components/listers/CleanCleanDetail"

import HotelRoomHotelRoomManager from "./components/listers/HotelRoomHotelRoomCards"
import HotelRoomHotelRoomDetail from "./components/listers/HotelRoomHotelRoomDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reserves/reserves',
                name: 'ReserveReserveManager',
                component: ReserveReserveManager
            },
            {
                path: '/reserves/reserves/:id',
                name: 'ReserveReserveDetail',
                component: ReserveReserveDetail
            },

            {
                path: '/cleans/cleans',
                name: 'CleanCleanManager',
                component: CleanCleanManager
            },
            {
                path: '/cleans/cleans/:id',
                name: 'CleanCleanDetail',
                component: CleanCleanDetail
            },

            {
                path: '/hotelRooms/hotelRooms',
                name: 'HotelRoomHotelRoomManager',
                component: HotelRoomHotelRoomManager
            },
            {
                path: '/hotelRooms/hotelRooms/:id',
                name: 'HotelRoomHotelRoomDetail',
                component: HotelRoomHotelRoomDetail
            },




    ]
})
