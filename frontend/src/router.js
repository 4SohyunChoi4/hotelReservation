
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import PointPointManager from "./components/listers/PointPointCards"
import PointPointDetail from "./components/listers/PointPointDetail"

import ReserveReserveManager from "./components/listers/ReserveReserveCards"
import ReserveReserveDetail from "./components/listers/ReserveReserveDetail"

import NotifyNotifyManager from "./components/listers/NotifyNotifyCards"
import NotifyNotifyDetail from "./components/listers/NotifyNotifyDetail"

import HotelRoomHotelRoomManager from "./components/listers/HotelRoomHotelRoomCards"
import HotelRoomHotelRoomDetail from "./components/listers/HotelRoomHotelRoomDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/points/points',
                name: 'PointPointManager',
                component: PointPointManager
            },
            {
                path: '/points/points/:id',
                name: 'PointPointDetail',
                component: PointPointDetail
            },

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
                path: '/notifies/notifies',
                name: 'NotifyNotifyManager',
                component: NotifyNotifyManager
            },
            {
                path: '/notifies/notifies/:id',
                name: 'NotifyNotifyDetail',
                component: NotifyNotifyDetail
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
